package com.mjacobo.monitoreorules.ruleservices;

import com.mjacobo.monitoreorules.RuleRequest;
import com.mjacobo.monitoreorules.RuleResponse;

public interface RulesServices {
	RuleResponse executeRule(RuleRequest request);
}
