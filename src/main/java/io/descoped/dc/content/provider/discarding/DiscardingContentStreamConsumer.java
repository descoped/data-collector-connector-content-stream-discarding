package io.descoped.dc.content.provider.discarding;

import io.descoped.dc.api.content.ClosedContentStreamException;
import io.descoped.dc.api.content.ContentStreamBuffer;
import io.descoped.dc.api.content.ContentStreamConsumer;

import java.util.concurrent.TimeUnit;

public class DiscardingContentStreamConsumer implements ContentStreamConsumer {

    @Override
    public String topic() {
        return null;
    }

    @Override
    public ContentStreamBuffer receive(int timeout, TimeUnit unit) throws InterruptedException, ClosedContentStreamException {
        return null;
    }

    @Override
    public void seek(long timestamp) {

    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public void close() throws Exception {

    }
}
