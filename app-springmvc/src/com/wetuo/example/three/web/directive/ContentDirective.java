package com.wetuo.example.three.web.directive;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wetuo.example.three.entity.User;

import freemarker.core.Environment;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateNumberModel;
import freemarker.template.TemplateScalarModel;

public class ContentDirective implements TemplateDirectiveModel {

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		
		List<User> tag_list = new ArrayList<User>();
		tag_list.add(new User(21, "lily", "canada"));
		tag_list.add(new User(22, "slice", "rasssion"));
		tag_list.add(new User(20, "qianqian", "china"));

		env.setVariable("tag_list", new DefaultObjectWrapper().wrap(tag_list));
		
        TemplateModel paramValue_count = (TemplateModel) params.get("count");
        int count = ((TemplateNumberModel) paramValue_count).getAsNumber().intValue();
        
		for(int i = 0; i < count ; i++) {
			body.render(env.getOut());
			env.getOut().write("---------------------------</br>");
		}
		
		

	}

}
