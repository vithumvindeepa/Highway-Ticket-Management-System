package com.example.vehicleservice.service.impl;

/**
 * @author Vithum vindeepa
 */
@Service
@Transactional
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private static final Logger logger = LoggerFactory.getLogger(VehicleServiceImpl.class);

    private final VehicleRepo vehicleRepo;


    @Override
    public String newVehicle(VehicleDTO vehicleDTO) {
        logger.info("Attempting to save Vehicle: {}", vehicleDTO.getId());
        boolean opt = vehicleRepo.existsById(vehicleDTO.getId());
        if (opt) {
            logger.warn("Vehicle id already exists: {}", vehicleDTO.getId());
            throw new QuantityExceededException("Vehicle already exists");
        } else {
            vehicleRepo.save(new Vehicle(vehicleDTO.getId(),vehicleDTO.getType(),vehicleDTO.getUserId()));
            logger.info("Vehicle saved successfully: {}", vehicleDTO.getId());
            return "Vehicle saved successfully";
        }
    }

    @Override
    public void deleteVehicle(String id) {

    }

    @Override
    public VehicleDTO getVehicle(String id) {
        logger.info("Fetching Vehicle: {}", id);
        Vehicle vehicle = vehicleRepo.getReferenceById(id);
        return new VehicleDTO(vehicle.getId(), vehicle.getType(),vehicle.getUserId());
    }

    @Override
    public String updateVehicle(VehicleDTO vehicleDTO) {
        logger.info("Attempting to update Vehicle: {}", vehicleDTO.getId());
        Vehicle existingVehicleOpt = vehicleRepo.getReferenceById(vehicleDTO.getId());

        // Update the customer entity with new values
        Vehicle updateVehicle =new Vehicle(vehicleDTO.getId(),vehicleDTO.getType(),vehicleDTO.getUserId());
        updateVehicle.setId(existingVehicleOpt.getId()); // Ensure the ID remains the same

        vehicleRepo.save(updateVehicle);
        logger.info("Vehicle updated successfully: {}", updateVehicle.getId());
        return "Vehicle updated successfully";
    }

    @Override
    public boolean isVehicleExist(String id) {
        logger.info("Fetching Vehicle: {}", id);
        return vehicleRepo.existsById(id);
    }
}
