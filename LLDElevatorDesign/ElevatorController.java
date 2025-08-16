package LLDElevatorDesign;



import java.util.PriorityQueue;

public  class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){

        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>(); //smallest element first in the queue
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a); //largest element first in the queue

    }
     public void submitExternalRequest(int floor, Direction direction){

        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
     }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        // TODO: Implement elevator control logic
        // This method should handle elevator movement based on requests
        System.out.println("Elevator " + elevatorCar.id + " control method called");
    }
}
