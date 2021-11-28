import com.aique.*;

def call(body, scriptInput) {

	script{
      body()
	}
	
	def car = new Car(scriptInput)
	car.numberOfDoors = 5
	car.brand = "BMW"
	car.model = "320 D"
	car.printOutCar()
}