package racingcar;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cars {

    private final List<Car> cars;

    public Cars(int num, RuleStrategy ruleStrategy) {
        this.cars = IntStream.range(0, num)
                .mapToObj(i -> new Car(ruleStrategy))
                .collect(Collectors.toList());
    }

    public void move() {
        this.cars.stream().forEach(car -> car.move());
    }

    public List<Integer> getCarPositions() {
        return this.cars.stream()
                .map(car -> car.getPosition())
                .collect(Collectors.toList());
    }

    
}