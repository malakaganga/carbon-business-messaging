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

package org.wso2.carbon.business.messaging.admin.services.managers;

import org.wso2.andes.kernel.AndesMessage;
import org.wso2.andes.kernel.AndesMessageMetadata;
import org.wso2.carbon.business.messaging.admin.services.exceptions.InternalServerException;

import java.util.List;

/**
 * This interface provides the base for managing all dead letter channel related services.
 */
public interface DLCManagerService {

    /**
     * Delete a selected message list from a given Dead Letter Queue of a tenant.
     *
     * @param andesMetadataIDs The browser message Ids
     * @param dlcQueueName     The Dead Letter Queue Name for the tenant
     */
    void deleteMessagesFromDeadLetterQueue(long[] andesMetadataIDs, String dlcQueueName);

    /**
     * Delete a selected message list from a given Dead Letter Queue of a tenant.
     *
     * @param queueName The browser message Ids
     * @param dlcQueueName     The Dead Letter Queue Name for the tenant
     */
    long getMessageCountInDLCForQueue(String queueName, String dlcQueueName) throws InternalServerException;

    /**
     * Delete a selected message list from a given Dead Letter Queue of a tenant.
     *
     *  The browser message Ids
     * @param dlcQueueName     The Dead Letter Queue Name for the tenant
     */
    long getMessagCountInDLC(String dlcQueueName) throws InternalServerException;

    /**
     * Delete a selected message list from a given Dead Letter Queue of a tenant.
     *
     * @param queueName The browser message Ids
     * @param dlcQueueName     The Dead Letter Queue Name for the tenant
     */
    List<AndesMessageMetadata> getMessageMetadataInDLCForQueue(final String queueName,
                                                                    final String dlcQueueName, long firstMsgId, int
                                                                            count) throws InternalServerException;

    /**
     * Delete a selected message list from a given Dead Letter Queue of a tenant.
     *
     * @param queueName The browser message Ids
     * @param dlcQueueName     The Dead Letter Queue Name for the tenant
     */
    List<AndesMessage> getNextNMessageContentInDLCForQueue(final String queueName, final String dlcQueueName, long
            firstMsgId, int count) throws InternalServerException;

    /**
     * Restore a given browser message Id list from the Dead Letter Queue to the same queue it was previous in before
     * moving to the Dead Letter Queue and remove them from the Dead Letter Queue.
     *
     * @param sourceQueue The browser message Ids
     * @param dlcQueueName     The Dead Letter Queue Name for the tenant
     */
    int rerouteAllMessagesInDeadLetterChannelForQueue(String dlcQueueName, String sourceQueue, String targetQueue,
                                                      int internalBatchSize, boolean restoreToOriginalQueue) throws
            InternalServerException;

    /**
     * Restore a given browser message Id list from the Dead Letter Queue to the same queue it was previous in before
     * moving to the Dead Letter Queue and remove them from the Dead Letter Queue.
     *
     * @param messageIds The browser message Ids
     * @param sourceQueue     The Dead Letter Queue Name for the tenant
     */
    int moveMessagesFromDLCToNewDestination(List<Long> messageIds, String sourceQueue, String targetQueue, boolean
            restoreToOriginalQueue) throws InternalServerException;

}
