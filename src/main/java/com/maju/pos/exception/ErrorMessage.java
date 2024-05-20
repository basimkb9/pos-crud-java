package com.maju.pos.exception;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessage<T> {
    T body;
    LocalDateTime localTime;
}