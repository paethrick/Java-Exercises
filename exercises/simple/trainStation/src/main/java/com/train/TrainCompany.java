package com.train;

import java.util.ArrayList;
import java.util.List;

public class TrainCompany {

    List<Train> trainList;

    public TrainCompany(List<Train> trainList) {
        this.trainList = new ArrayList<>(trainList);
    }

    public float getRevenue(){
        return trainList.stream().map(Train::getRevenue).reduce(Float::sum).orElse(0f);
    }
}
