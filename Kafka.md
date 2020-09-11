## kafka

#### 主要优势
1、极致的性能：基于scala于java开发的一门语言，大量使用批量处理和异步的思想，每秒可以处理千万级别的消息
2、生态系统的无敌兼容：kafka于周边生态是兼容性最好的，尤其是在大数据于流处理方面

#### 流平台
    1、消息对列：发布于订阅消息流
    2、容错持久化分布式存储：kafka会把消息持久化到磁盘，避免丢失风险
    3、流式处理：消息发布时候进行处理，kafka会提供一个完整的流式处理库
    
#### 应用场景
    1、消息队列：建立实时数据管道，可靠的在系统于应用程序之间获取数据
    2、数据处理：构建实时数据处理程序来转换或者处理数据流
    
#### 重要概念
    1、Producer(生产者)：产生消息的一方
    2、Consumer（消费者）：消费消息的一方
    3、broker（代理）： 1 topic（主题）    2 Partition（分区） 3、Replica（副本）
    4、topic（主题）：producer将消息发布到topic中，由consumer进行消费
    5、partition（分区）：一个topic可以有多个topic
    6、Replica（副本）：一个partition可能有多个Replica，通过这个于持久化确保数据容灾
    7、通过偏移量（offset）来消息在分区的有序性

#### zookeeper在kafka中的作用
    1、broker（代理）注册，每一个broker启动的时候会到broker/ids下面创建自己的节点
    2、topic（主题）注册
    3、负载均衡