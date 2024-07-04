package com.example.vehicleservice.service.impl;

/**
 * @author Vithum vindeepa
 */
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean isUserExists(String userId) {
        try {
            String url = "http://user-service/api/v1/user/userExists/" + userId;
            Boolean userExists = restTemplate.getForObject(url, Boolean.class);
            logger.info("User Exists: {}", userExists);
            return userExists != null && userExists;
        } catch (Exception e) {
            logger.error("Error checking if user exists", e);
        }
        return false;
    }
}

