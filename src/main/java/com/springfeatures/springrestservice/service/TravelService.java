package com.springfeatures.springrestservice.service;

import com.springfeatures.springrestservice.exception.InvalidTravelParametersException;
import com.springfeatures.springrestservice.model.TimeToCross;

public interface TravelService {

    TimeToCross calculateTimeToCross(int distance, int speed) throws InvalidTravelParametersException;
}
