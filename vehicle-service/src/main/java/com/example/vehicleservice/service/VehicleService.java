package com.example.vehicleservice.service;

/**
 * @author Vithum vindeepa
 */
public interface VehicleService {
    String newVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String id);
    VehicleDTO getVehicle(String id);
    String updateVehicle(VehicleDTO vehicleDTO);
    boolean isVehicleExist(String id);
}
