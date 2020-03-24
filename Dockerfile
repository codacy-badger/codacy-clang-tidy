FROM alpine:3.11

COPY docs /docs
COPY entry.sh /
RUN chmod +x /entry.sh

RUN adduser -u 2004 -D docker && chown -R docker:docker /docs

USER docker

ENTRYPOINT [ "sh", "/entry.sh" ]
