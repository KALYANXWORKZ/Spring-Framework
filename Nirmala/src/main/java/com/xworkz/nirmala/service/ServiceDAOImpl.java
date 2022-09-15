package com.xworkz.nirmala.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.dao.NirmalaDAOImpl;
import com.xworkz.nirmala.entity.NirmalaEntity;

public class ServiceDAOImpl implements ServiceDAO {
	NirmalaDAO dao = new NirmalaDAOImpl();

	public boolean save(NirmalaEntity entity) {
		ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NirmalaEntity>> violation = validator.validate(entity);
		if (violation.size() > 0) {
			System.out.println("Invalid details");
			for (ConstraintViolation<NirmalaEntity> constraintViolation : violation) {
				System.out.println(constraintViolation.getMessage());

		 	}

		} else {
			System.out.println("valid object");
			dao.save(entity);
		}
		return true;
	}

}
