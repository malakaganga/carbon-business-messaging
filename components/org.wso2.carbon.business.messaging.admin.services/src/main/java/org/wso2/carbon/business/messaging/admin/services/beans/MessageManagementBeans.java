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

package org.wso2.carbon.business.messaging.admin.services.beans;

import org.wso2.carbon.business.messaging.admin.services.exceptions.DestinationManagerException;
import org.wso2.carbon.business.messaging.admin.services.exceptions.MessageManagerException;
import org.wso2.carbon.business.messaging.admin.services.types.Message;

import java.util.List;

/**
 * The following class contains the MBeans invoking services related to message resources.
 */
public class MessageManagementBeans {

    /**
     * Browse message of a destination using message ID.
     * <p>
     * To browse messages without message ID, use {@link MessageManagementBeans#getMessagesOfDestinationByOffset(String,
     * String, String, boolean, int, int)}.
     *
     * @param protocol        The protocol type matching for the message. Example : amqp, mqtt.
     * @param destinationType The destination type matching for the message. Example : queue, topic, durable_topic.
     * @param destinationName The name of the destination
     * @param content         Whether to return message content or not.
     * @param nextMessageID   The starting message ID to return from.
     * @param limit           The number of messages to return.
     * @return A list of {@link Message}s.
     * @throws MessageManagerException Error in handling messages related information
     */
    public List<Message> getMessagesOfDestinationByMessageID(String protocol, String destinationType,
            String destinationName, boolean content, long nextMessageID, int limit) throws MessageManagerException {
        throw new UnsupportedOperationException();
    }

    /**
     * Browse message of a destination. Please note this is time costly.
     * <p>
     * To browse messages with message ID, use {@link MessageManagementBeans#getMessagesOfDestinationByMessageID
     * (String, String, String, boolean, long, int)}.
     *
     * @param protocol        The protocol type matching for the message. Example : amqp, mqtt.
     * @param destinationType The destination type matching for the message. Example : queue, topic, durable_topic.
     * @param destinationName The name of the destination
     * @param content         Whether to return message content or not.
     * @param offset          Starting index of the messages to return.
     * @param limit           The number of messages to return.
     * @return A list of {@link Message}s.
     * @throws MessageManagerException Error in handling messages related information
     */
    public List<Message> getMessagesOfDestinationByOffset(String protocol, String destinationType,
            String destinationName, boolean content, int offset, int limit) throws MessageManagerException {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets a message by message ID belonging to a particular protocol, destination type and destination name.
     *
     * @param protocol        The protocol type matching for the message. Example : amqp, mqtt.
     * @param destinationType The destination type matching for the message. Example : queue, topic, durable_topic.
     * @param destinationName The name of the destination to which the message belongs to.
     * @param andesMessageID  The message ID. This message is the andes metadata message ID.
     * @param content         Whether to return content or not.
     * @return A {@link Message}.
     * @throws MessageManagerException Error in handling messages related information
     */
    public Message getMessage(String protocol, String destinationType, String destinationName, long andesMessageID,
            boolean content) throws MessageManagerException {
        throw new UnsupportedOperationException();
    }

    /**
     * Purge all messages belonging to a destination.
     *
     * @param protocol        The protocol type matching for the message. Example : amqp, mqtt.
     * @param destinationType The destination type matching for the message. Example : queue, topic, durable_topic.
     * @param destinationName The name of the destination to purge messages.
     * @throws MessageManagerException Error in handling messages related information
     */
    public void deleteMessages(String protocol, String destinationType, String destinationName)
            throws MessageManagerException {
        throw new UnsupportedOperationException();
    }

    /**
     * Invoke service bean for permanently deleting messages from the Dead Letter Channel.
     *
     * @param messageIDs           Browser message Id / External message Id list to be deleted
     * @param destinationQueueName Dead Letter Queue name for the respective tenant
     * @throws DestinationManagerException Error in handling messages related information
     */
    public void deleteMessagesFromDeadLetterQueue(long[] messageIDs, String destinationQueueName)
            throws DestinationManagerException {
        throw new UnsupportedOperationException();
    }

    /**
     * Invoke service bean for restoring messages from Dead Letter Channel to their original destinations.
     *
     * @param messageIDs           Browser message Id / External message Id list to be deleted
     * @param destinationQueueName Dead Letter Queue name for the respective tenant
     * @throws DestinationManagerException Error in handling messages related information
     */
    public void restoreMessagesFromDeadLetterQueue(long[] messageIDs, String destinationQueueName)
            throws DestinationManagerException {
        throw new UnsupportedOperationException();
    }

    /**
     * Invoke service bean for restoring messages from Dead Letter Channel to a given destination.
     *
     * @param messageIDs              Browser message Id / External message Id list to be deleted
     * @param newDestinationQueueName The new destination for the messages in the same tenant
     * @param destinationQueueName    Dead Letter Queue name for the respective tenant
     * @throws DestinationManagerException Error in handling messages related information
     */
    public void restoreMessagesFromDeadLetterQueueWithDifferentDestination(long[] messageIDs,
            String newDestinationQueueName, String destinationQueueName) throws DestinationManagerException {
        throw new UnsupportedOperationException();
    }

}
