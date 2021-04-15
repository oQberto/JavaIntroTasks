package by.jonline.module4.simplest_class_and_object.task4;

import java.util.Arrays;

public class TrainService {

    public Train[] sortingByNumbers(Train[] trains) {
        Arrays.sort(trains, TrainUtil.trainNumberComparator);
        return trains;
    }

    public String outputOfInformationAboutTrain(Train[] trains, int userInput) {

        for (Train train : trains) {
            if (userInput == train.getTrainNumber()) {
                return "Поезд " + train.getTrainNumber() + " прибывает в " + train.getDestination() + " в " + train.getDepartureTime();
            }
        }
        return "";
    }

    public Train[] sortingByDestination(Train[] trains) {
        Arrays.sort(trains, TrainUtil.compareByTwoFields);
        return trains;
    }
}
