package org.wso2.carbon.business.messaging.admin.services.managers.impl;

import org.wso2.andes.kernel.Andes;
import org.wso2.andes.kernel.AndesException;
import org.wso2.andes.kernel.AndesMessageMetadata;
import org.wso2.carbon.business.messaging.admin.services.internal.MBRESTServiceDataHolder;
import org.wso2.carbon.business.messaging.admin.services.managers.DLCManagerService;

import java.util.List;


/**
 * Implementation for handling dlc queue related resource through OSGi.
 */
public class DLCManagerServiceImpl implements DLCManagerService {
    /**
     * Registered andes core instance through OSGi.
     */
    private Andes andesCore;

    public DLCManagerServiceImpl() {
        andesCore = MBRESTServiceDataHolder.getInstance().getAndesCore();
    }

    @Override
    public void restoreMessagesFromDeadLetterQueue(List<Long> andesMetadataIDs, String dlcQueueName) {

    }

    @Override
    public void restoreMessagesFromDeadLetterQueue(List<Long> andesMetadataIDs, String newDestinationQueueName,
                                                   String dlcQueueName) {

    }

    @Override
    public int rerouteAllMessagesInDeadLetterChannelForQueue(String dlcQueueName, String sourceQueue, String
            targetQueue, int internalBatchSize, boolean restoreToOriginalQueue) {
        try {
            return andesCore.rerouteAllMessagesInDeadLetterChannelForQueue(dlcQueueName, sourceQueue, targetQueue,
                    internalBatchSize, restoreToOriginalQueue);
        } catch (AndesException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int moveMessagesFromDLCToNewDestination(List<Long> messageIds, String sourceQueue, String targetQueue,
                                                   boolean restoreToOriginalQueue) {
        try {
            return andesCore.moveMessagesFromDLCToNewDestination(messageIds, sourceQueue, targetQueue, restoreToOriginalQueue);
        } catch (AndesException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<AndesMessageMetadata> getMessageMetadataInDLCForQueue(String queueName, String dlcQueueName, long
            firstMsgId, int count) {
        try {
            return andesCore.getNextNMessageMetadataInDLCForQueue(queueName, dlcQueueName, firstMsgId, count);
        } catch (AndesException e) {

        }
        return null;
    }

    @Override
    public void deleteMessagesFromDeadLetterQueue(long[] andesMetadataIDs, String dlcQueueName) {
        andesCore.deleteMessagesFromDeadLetterQueue(andesMetadataIDs, dlcQueueName);
    }

    @Override
    public long getMessageCountInDLCForQueue(String queueName, String dlcQueueName) {
        try {
            return andesCore.getMessageCountInDLCForQueue(queueName, dlcQueueName);
        } catch (AndesException e) {
        }
        return 10;
    }

    @Override
    public long getMessagCountInDLC(String dlcQueueName) {
        try {
            return andesCore.getMessageCountInDLC(dlcQueueName);
        } catch (AndesException e) {

        }
        return 10;
    }
}
