package com.amadeus.middleware.odyssey.reactive.messaging.quarkus.rm.deployment;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.jboss.jandex.DotName;

import com.amadeus.middleware.odyssey.reactive.messaging.core.Async;
import com.amadeus.middleware.odyssey.reactive.messaging.core.Message;
import com.amadeus.middleware.odyssey.reactive.messaging.core.MessageInitializer;
import com.amadeus.middleware.odyssey.reactive.messaging.core.MessageScoped;
import com.amadeus.middleware.odyssey.reactive.messaging.core.NodeName;

public final class DotNames {
  private DotNames() {
  }

  static final DotName VOID = DotName.createSimple(void.class.getName());
  static final DotName NODENAME = DotName.createSimple(NodeName.class.getName());
  static final DotName INCOMING = DotName.createSimple(Incoming.class.getName());
  static final DotName OUTGOING = DotName.createSimple(Outgoing.class.getName());
  static final DotName MESSAGE = DotName.createSimple(Message.class.getName());
  static final DotName MESSAGE_SCOPED = DotName.createSimple(MessageScoped.class.getName());
  static final DotName ASYNC = DotName.createSimple(Async.class.getName());
  static final DotName MESSAGE_INITIALIZER = DotName.createSimple(MessageInitializer.class.getName());
}
