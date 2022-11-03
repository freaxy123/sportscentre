package com.service.workout.controller;

import com.service.workout.dto.WorkoutRequest;
import com.service.workout.service.WorkoutService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workout")
@Slf4j
public record WorkoutController(WorkoutService workoutservice) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createWorkout(@RequestBody WorkoutRequest request){
        log.info("Workoutcontroller: New Workout Create request {]", request);
        workoutservice.create(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void GetAllWorkouts(){
        log.info("Get All Workouts");
        workoutservice.getAll();
    }
}
