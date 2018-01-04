# 设计模式之桥接模式（卷七）

> 桥接模式用于处理多维度变化的情况。用抽象关联取代了传统的多层继承，将类之间的静态继承关系转换为动态的对象组合关系，使得系统更加灵活，并易于扩展。

## 0x00 组成元素

- Abstraction：抽象类用于定义一个维度的接口，同时还持有其他维度的引用。
- RefinedAbstraction:补充抽象类继承于抽象类，它实现了抽象类中的业务方法，在业务方法中还会调用Implementor的业务方法。
- Implementor：实现类接口定义其余维度的方法，以供抽象类Abstraction调用。
- ConcreteImplementor：具体实现类。

## 0x01 结构示意图
> 举一个具体的示例，有大中小类型的笔，以及颜色两个维度。现在需要设计一个系统，方便日后扩展，客户端可以随意组合这两个维度来进行draw操作。

![](http://www.plantuml.com/plantuml/png/jPFBIiD068NtynG3tRIM1jnc8SKkf0j1V8DfCeNGt4YckeW5RnKhrKrLj1J56nQgjT92Qo_qOSpDbQzWaab4g8eRinWoSqxEVFy_axHEa4QAaWXa965THHo6d28nXKA1KUTX30SFD00d8bs76L70CZ502SWAmJ2d4A98KCc70h3Qr_P-tsazkRrBjtTZTvjM-Sugzyr9pQdlMkqBvwZZF8y0bdde9u0mTmN91eXbEKLKD1YC8AbZal7VuWaMhYa23moKquc6E58Avf3Nq7eyuR648Ki2aacGbAGI6tmsmnhvWDLe-aRxzCNkdfY3nxVpMtEuPpSUt67B7DIjWoiglO-hxlJC7DVTpevptAHyNZrVFQ-RspDLBGly7t2ewnzX19bWBU-VR3Peg0UaQjvYrDqGYpAlOlutK-XQ58luLni0KPTXggYcDXRy8sQXCxgtArD0I_vEYRQFD4hCGdfrmEU-F-Xq2XaHvmaJ9jlLBRjH0VI6Xj9SADKEpKd3uqrxtV9-WWy0)

其中，Pan对应抽象类，IColor对于实现类接口。

## 0x10 总结

- 优点：使用关联来替代多层继承关系，大大减少了类的个数。高扩展性。是设计Java虚拟机和实现JDBC等驱动程序的核心模式之一。
- 增加系统理解和设计难度，需要识别出不同维度。
- 适用场景：一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展。


