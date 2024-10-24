package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_roomOccupiedAndDirty_True(){
        // arrange
        Room room = new Room(2, 120, true, true);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_roomNotOccupiedAndDirty(){
        // arrange
        Room room = new Room(2, 120, true, false);

        // act
        room.checkIn();

        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkout_roomWasOccupiedAndDirty(){
        // arrange
        Room room = new Room(2, 120, true, false);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

}