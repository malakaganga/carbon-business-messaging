/*
 * Copyright (c) 2017, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.business.messaging.admin.services.exceptions.mappers;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.business.messaging.admin.services.exceptions.DestinationNotFoundException;
import org.wso2.carbon.business.messaging.admin.services.types.ErrorResponse;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Mapper class for {@link DestinationNotFoundException}.
 */
@Component(
        name = "org.wso2.carbon.business.messaging.admin.services.exceptions.mappers.DestinationNotFoundErrorMapper",
        service = ExceptionMapper.class,
        immediate = true)
public class DestinationNotFoundErrorMapper implements ExceptionMapper<DestinationNotFoundException> {
    /**
     * {@inheritDoc}
     */
    @Override
    public Response toResponse(DestinationNotFoundException e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTitle("Requested destination is not found.");
        errorResponse.setCode(Response.Status.NOT_FOUND.getStatusCode());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setDescription("Requested destination is not available in the Message broker.");
        errorResponse.setMoreInfo(
                "Please contact administrator." + System.lineSeparator() + ExceptionUtils.getFullStackTrace(e));
        return Response.status(Response.Status.NOT_FOUND).entity(errorResponse).type(MediaType.APPLICATION_JSON)
                .build();
    }
}
