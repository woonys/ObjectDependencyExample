package com.example.objectdesign;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.objectdesign.domain.DateObject;
import com.example.objectdesign.domain.DateObjectService;
import com.example.objectdesign.evaluation.DateObjectEvaluationProcessor;

@ExtendWith(MockitoExtension.class)
public class DateObjectEvaluationProcessorTest {
    @Mock
    private DateObject dateObject;
    @Mock
    private DateObjectService dateObjectService;

    @InjectMocks
    private DateObjectEvaluationProcessor doep;

    @Test
    void test() {

    }
}
