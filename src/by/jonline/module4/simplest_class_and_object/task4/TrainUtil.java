package by.jonline.module4.simplest_class_and_object.task4;

import java.time.LocalTime;
import java.util.Comparator;

public class TrainUtil {

    public static Comparator<Train> trainNumberComparator = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.getTrainNumber() - o2.getTrainNumber();
        }
    };

    public static Comparator<Train> destinationComparator = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            String destination1 = o1.getDestination().toUpperCase();
            String destination2 = o2.getDestination().toUpperCase();

            return destination1.compareTo(destination2);
        }
    };

    public static Comparator<Train> departureTimeComparator = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            LocalTime departureTime1 = o1.getDepartureTime();
            LocalTime departureTime2 = o2.getDepartureTime();

            return departureTime1.compareTo(departureTime2);
        }
    };

    public static Comparator<Train> compareByTwoFields = destinationComparator.thenComparing(departureTimeComparator);
}