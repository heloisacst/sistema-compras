package com.educandoweb.course.service;

import com.educandoweb.course.model.OrderItem;
import com.educandoweb.course.repository.OrderItemRepository;
import com.educandoweb.course.service.exceptions.DatabaseException;
import com.educandoweb.course.service.exceptions.EntityNotFoundException;
import com.educandoweb.course.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository orderItemRepository;

    public OrderItem insert(OrderItem obj) {
        return orderItemRepository.save(obj);
    }

    public OrderItem update(Long id, OrderItem obj) {
        try {
            OrderItem entity = orderItemRepository.getReferenceById(id);
            updateData(entity, obj);
            return orderItemRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(OrderItem entity, OrderItem obj) {
        entity.setProduct(obj.getProduct());
        entity.setQuantity(obj.getQuantity());
    }

    public void delete(Long id) {
        try {
            orderItemRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
         }
    }

}
