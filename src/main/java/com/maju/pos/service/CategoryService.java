package com.maju.pos.service;
import com.maju.pos.domain.Category;
import com.maju.pos.exception.RecordNotFoundException;
import com.maju.pos.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAll() {
        return new ArrayList<>(categoryRepository.findAll());
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    public Category getById(Long id){
        Optional<Category> found = categoryRepository.findById(id);
        if(found.isPresent()){
            return found.get();
        }
        else{
            throw new RecordNotFoundException(String.format("No Category exists on id %d",id));
        }
    }

}