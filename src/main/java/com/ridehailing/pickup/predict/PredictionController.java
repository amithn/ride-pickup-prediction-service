package com.ridehailing.pickup.predict;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

  @GetMapping("/predict")
  public TimeToPickUp howLongToPickUp() {
      return new TimeToPickUp(10);
  }

  static class TimeToPickUp {
      private final int seconds;

      public TimeToPickUp(int seconds) {
            this.seconds = seconds;
        }
   }
}