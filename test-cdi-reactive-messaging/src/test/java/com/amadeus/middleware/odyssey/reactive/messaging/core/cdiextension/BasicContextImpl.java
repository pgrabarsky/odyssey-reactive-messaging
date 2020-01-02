package com.amadeus.middleware.odyssey.reactive.messaging.core.cdiextension;

import com.amadeus.middleware.odyssey.reactive.messaging.core.MessageContext;

public class BasicContextImpl implements BasicContext {
  @Override
  public String sayHello() {
    return "Hello";
  }

  @Override
  public MessageContext merge(MessageContext... messageContexts) {
    throw new RuntimeException("not implemented");
  }

  @Override
  public boolean isPropagable() {
    return false;
  }

  @Override
  public String getContextKey() {
    return KEY;
  }

  @Override
  public String getContextMergeKey() {
    return MERGE_KEY;
  }
}
