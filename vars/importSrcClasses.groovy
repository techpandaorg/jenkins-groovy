import com.aique.*;

def call(script) {
    def car = new Car(script)
	car.numberOfDoors = 5
	car.brand = "BMW"
	car.model = "320 D"
	car.printOutCar()
}