package practice;

import java.util.Objects;

public class Room {
    private int roomNumber;
    private String roomType;
    private int roomFloor;

    Room(){}

    public Room(int roomNumber, String roomType, int roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getRoomNumber() == room.getRoomNumber() && getRoomFloor() == room.getRoomFloor() && getRoomType().equals(room.getRoomType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomNumber(), getRoomType(), getRoomFloor());
    }

    @Override
    public String toString() {
        return "practice.Room{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", roomFloor=" + roomFloor +
                '}';
    }
}
