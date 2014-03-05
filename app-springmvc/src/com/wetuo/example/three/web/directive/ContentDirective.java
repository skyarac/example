package com.wetuo.example.three.web.directive;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

public class ContentDirective implements TemplateDirectiveModel{

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		PrintWriter out = (PrintWriter) env.getOut();
		out.write("directive ...");
		
	}

}
