Here are key JVM arguments to improve performance in Java 11:

Garbage Collection
```bash
Use G1GC (default in Java 11, but can be explicit):
bash-XX:+UseG1GC
-XX:MaxGCPauseMillis=200
-XX:G1HeapRegionSize=16m
For low-latency applications, consider ZGC:
bash-XX:+UnlockExperimentalVMOptions
-XX:+UseZGC
```

Memory Management
```bash
bash-Xms4g                # Initial heap size (set equal to Xmx for stable performance)
-Xmx4g                    # Maximum heap size
-XX:MetaspaceSize=256m    # Initial metaspace size
-XX:MaxMetaspaceSize=512m # Maximum metaspace size
-XX:+AlwaysPreTouch       # Touch memory pages on JVM startup for better performance
```

Performance Tuning
```bash
bash-XX:+UseStringDeduplication    # Reduce memory footprint by deduplicating strings
-XX:+OptimizeStringConcat          # Optimize string concatenation
-XX:+UseCompressedOops             # Use compressed pointers (enabled by default for heaps < 32GB)
-XX:+TieredCompilation             # Enable tiered compilation (default in Java 11)
-XX:ReservedCodeCacheSize=512m     # Increase code cache for large applications
```

Diagnostic & Monitoring
```bash
bash-XX:+PrintGCDetails
-XX:+PrintGCDateStamps
-Xlog:gc*:file=gc.log:time,uptime:filecount=5,filesize=100m
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=/path/to/dumps
```

Example Configuration for Spring Boot
```bash
bashjava -server \
-Xms4g -Xmx4g \
-XX:+UseG1GC \
-XX:MaxGCPauseMillis=200 \
-XX:+UseStringDeduplication \
-XX:MetaspaceSize=256m \
-XX:MaxMetaspaceSize=512m \
-XX:ReservedCodeCacheSize=512m \
-XX:+AlwaysPreTouch \
-XX:+HeapDumpOnOutOfMemoryError \
-jar your-springboot-app.jar
```