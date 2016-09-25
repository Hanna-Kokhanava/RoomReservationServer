package controllers;

import model.Room;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ania on 24.09.2016.
 */

@RestController

public class RoomController {

    @RequestMapping(value = "/getAllRooms", method = RequestMethod.GET, headers="Accept=application/json")
    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<Room>();
        Room r1 = new Room("asd", 1);
        Room r2 = new Room("weqe", 2);

        rooms.add(r1);
        rooms.add(r2);

        return rooms;
    }
}