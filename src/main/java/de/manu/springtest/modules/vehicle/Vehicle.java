package de.manu.springtest.modules.vehicle;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Used to test bean inheritance, validation
 */
@Setter
public class Vehicle {

    private transient Logger logger;
    private String name;
    private String manufacturerName;
    private boolean hasTrunk;
    private int trunkCapacityInKg;
    private LocalDate creationDate;
    private LocalTime creationTime;

    public static class VehicleValidator implements Validator {
        public boolean supports(Class<?> clazz) { return Vehicle.class.isAssignableFrom(clazz); }
        public void validate(Object target, Errors errors) {
            if (!(target instanceof Vehicle vehicle))
                return;

            ValidationUtils.rejectIfEmptyOrWhitespace(errors, vehicle.name, "name is blank");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, vehicle.manufacturerName, "manufacturerName is blank");

            if (vehicle.trunkCapacityInKg < 0)
                errors.reject("trunk capacity can't be negative");
        }
    }

}
