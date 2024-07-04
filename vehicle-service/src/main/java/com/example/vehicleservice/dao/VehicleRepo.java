package com.example.vehicleservice.dao;

/**
 * @author Vithum vindeepa
 */
public interface VehicleRepo {
    public interface VehicleRepo extends JpaRepository<Vehicle, String>
}
