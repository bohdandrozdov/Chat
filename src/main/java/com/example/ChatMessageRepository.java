package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bohdan on 15.02.16.
 */
public interface ChatMessageRepository extends JpaRepository<ChatMessageModel, String> {
}