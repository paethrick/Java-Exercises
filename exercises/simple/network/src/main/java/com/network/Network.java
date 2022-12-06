package exercises.simple.network.src.main.java.com.network;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private List<Device> devices;

    public Network(List<Device> devices) {
        this.devices = new ArrayList<>(devices);
    }

    public List<Device> getAllDevices(){
        return devices;
    }

    public List<Normal> checkNormalDevices(Smart smart, int power){
        List<Normal> normals = new ArrayList<>();
        for(Device device : devices){
            if(device instanceof Normal normal){
                if(smart.getPower() < device.getPower() && smart.getPower() + power >= device.getPower() ||
                        smart.getPower() > device.getPower() && smart.getPower() - power <= device.getPower()){
                    normals.add(normal);
                }
            }
        }
        return normals;
    }
}
