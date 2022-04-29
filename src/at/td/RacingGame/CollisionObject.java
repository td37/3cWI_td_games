package at.td.RacingGame;

public class CollisionObject {
    private boolean hasCollision;
    private ComputerCar computerCar;

    public CollisionObject(boolean hasCollision, ComputerCar computerCar) {
        this.hasCollision = hasCollision;
        this.computerCar = computerCar;
    }

    public boolean isHasCollision() {
        return hasCollision;
    }

    public void setHasCollision(boolean hasCollision) {
        this.hasCollision = hasCollision;
    }

    public ComputerCar getComputerCar() {
        return computerCar;
    }

    public void setComputerCar(ComputerCar computerCar) {
        this.computerCar = computerCar;
    }
}
