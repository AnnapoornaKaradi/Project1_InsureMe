package com.project.staragile.insureme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PolicyService {
	
	@Autowired
	PolicyRepository policyRepository;
	
	
	public Policy CreatePolicy() {
		
		Policy policy = generateDummyPolicy();
		
		return policyRepository.save(policy);
		
			
	}
	
	public Policy updatePolicy() {
		
		return null;
	}
	
	public Policy deletePolicy() {
		
		return null;
	}
	
	public Policy searchPolicy() {
		
		return null;
	}
	
	
	public Policy generateDummyPolicy() {
		return new Policy(2, "Annu", "Individual" , 10012, "12-June-2021", "12-June-2022");
	}

	public Policy registerPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepository.save(policy);
	}

	public Policy getPolicyDetails(int policyId) {
		// TODO Auto-generated method stub
		return policyRepository.findById(policyId).get();
	}

}
