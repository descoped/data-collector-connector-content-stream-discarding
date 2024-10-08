package io.descoped.dc.content.provider.discarding;

import de.huxhorn.sulky.ulid.ULID;
import io.descoped.dc.api.content.ContentStreamBuffer;
import io.descoped.dc.api.content.MetadataContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DiscardingContentStreamBuffer implements ContentStreamBuffer {

    private final static Logger LOG = LoggerFactory.getLogger(DiscardingContentStreamBuffer.class);

    public DiscardingContentStreamBuffer() {
    }


    @Override
    public ULID.Value ulid() {
        return null;
    }

    @Override
    public String position() {
        return null;
    }

    @Override
    public Set<String> keys() {
        return null;
    }

    @Override
    public byte[] get(String contentKey) {
        return new byte[0];
    }

    @Override
    public Map<String, byte[]> data() {
        return null;
    }

    @Override
    public List<MetadataContent> manifest() {
        return null;
    }

    static class Builder implements ContentStreamBuffer.Builder {

        private ULID.Value ulid;
        private String position;

        @Override
        public ContentStreamBuffer.Builder ulid(ULID.Value ulid) {
            this.ulid = ulid;
            return this;
        }

        @Override
        public ContentStreamBuffer.Builder position(String position) {
            this.position = position;
            return this;
        }

        @Override
        public String position() {
            return null;
        }

        @Override
        public ContentStreamBuffer.Builder put(String key, byte[] payload) {
            return null;
        }

        @Override
        public ContentStreamBuffer.Builder buffer(String contentKey, byte[] content, MetadataContent manifest) {
            if (LOG.isTraceEnabled()) {
                LOG.trace("{} -> {} => {}", position, contentKey, new String(content));
            }
            return this;
        }

        @Override
        public byte[] get(String contentKey) {
            return new byte[0];
        }

        @Override
        public Set<String> keys() {
            return new HashSet<>();
        }

        @Override
        public List<MetadataContent> manifest() {
            return null;
        }

        @Override
        public ContentStreamBuffer build() {
            return new DiscardingContentStreamBuffer();
        }
    }
}
