package com.nighthawk.spring_portfolio.mvc.lights;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lightboard/")
public class LightBoardAPI {

    @GetMapping("/generate/{rows}/{cols}")
    public ResponseEntity<LightBoard> generateLightBoard(@PathVariable int rows, @PathVariable int cols) {
        LightBoard lightBoard = new LightBoard(rows, cols);
        return new ResponseEntity<>(lightBoard, HttpStatus.OK);
    }

}
