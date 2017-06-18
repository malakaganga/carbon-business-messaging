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

package org.wso2.carbon.business.messaging.admin.services.managers.bean.impl;

import org.wso2.andes.kernel.AndesMessageMetadata;
import org.wso2.carbon.business.messaging.admin.services.managers.DLCManagerService;

import java.util.List;

/**
 * This interface provides the base for managing all dead letter channel related services through JMX.
 */
public class DLCManagerServiceBeanImpl implements DLCManagerService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void restoreMessagesFromDeadLetterQueue(List<Long> andesMetadataIDs, String dlcQueueName) {

    }

    @Override
    public int moveMessagesFromDLCToNewDestination(List<Long> messageIds, String sourceQueue, String targetQueue,
                                                   boolean restoreToOriginalQueue) {
        return 0;
    }

    @Override
    public List<AndesMessageMetadata> getMessageMetadataInDLCForQueue(String queueName, String dlcQueueName, long
            firstMsgId, int count) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void restoreMessagesFromDeadLetterQueue(List<Long> andesMetadataIDs, String newDestinationQueueName,
            String dlcQueueName) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteMessagesFromDeadLetterQueue(long[] andesMetadataIDs, String dlcQueueName) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getMessageCountInDLCForQueue(String queueName, String dlcQueueName) {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getMessagCountInDLC(String dlcQueueName) {
        return 0;
    }

    @Override
    public int rerouteAllMessagesInDeadLetterChannelForQueue(String dlcQueueName, String sourceQueue, String
            targetQueue, int internalBatchSize, boolean restoreToOriginalQueue) {
        return 0;
    }
}
