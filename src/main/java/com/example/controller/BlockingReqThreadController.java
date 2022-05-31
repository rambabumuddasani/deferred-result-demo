package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingReqThreadController {

    /**
     * the request processing thread is blocked until the complete request is processed and the result is returned.
     * In case of long-running computations, this is a sub-optimal solution.
     * @param requestData
     * @return
     */
    @GetMapping("/process-blocking")
    public ResponseEntity<?> handleReqSync(@RequestParam("qry")  String requestData) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok("ok");
    }

}
