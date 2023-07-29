package com.ptit;

public class LeetCode1603 {

    public static class ParkingSystem {
        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if(carType == 1 && big > 0) {
                big--;
                return true;
            }
            else if(carType == 2 && medium > 0) {
                medium--;
                return true;
            }
            else if(carType == 3 && small > 0) {
                small--;
                return true;
            }
            return false;

        }

    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
        parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
        parkingSystem.addCar(3); // return false because there is no available slot for a small car
        parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.
    }
}

