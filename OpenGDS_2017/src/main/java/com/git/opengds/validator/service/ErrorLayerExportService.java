package com.git.opengds.validator.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ErrorLayerExportService {

	public boolean exportErrorLayer(String format, String type, String name, HttpServletRequest request,
			HttpServletResponse response) throws IOException;
}
