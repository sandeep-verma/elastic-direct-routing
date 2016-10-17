Elasticsearch Direct Routing Plugin
===================================

This plugin enables documents to be routed to shards according to the following formula.

```sh
selected_shard = routing_key % number_of_shards
```

For an example, consider a Elasticsearch index with 5 shards.
The table below shows for various routing keys how the documents will be routed to shards.

| routing_key | selected_shard |
|-------------|----------------|
|      0      |        0       |
|      1      |        1       |
|      2      |        2       |
|      3      |        3       |
|      4      |        4       |
|      5      |        0       |
|      6      |        1       |
|      7      |        2       |

In order to install the plugin, simply run: 
bin/plugin install https://github.com/sandeep-verma/elastic-direct-routing/raw/master/target/releases/elasticsearch-direct-routing-plugin-1.0.zip

Then in the elasticsearch.yml file add the following setting.

```sh
cluster.routing.operation.hash.type: org.elasticsearch.plugin.direct.DirectRoutingHash
```
