package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream

        //StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5

        //StreamSources.intNumbersStream().filter(elem -> elem < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        //StreamSources.intNumbersStream().filter(elem -> elem > 5).skip(1).limit(2).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        //System.out.println(StreamSources.intNumbersStream().filter(elem -> elem > 5).findFirst().orElse(-1));

        // Print first names of all users in userStream
        // TODO: Write code here
        //StreamSources.userStream().forEach(x -> System.out.println(x.getFirstName()));
        //StreamSources.userStream().forEach(x -> System.out.println(x));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here


//        StreamSources.userStream().filter(x -> StreamSources.intNumbersStream().anyMatch(y -> y == x.getId()))
//                .map(user -> user.getFirstName())
//                .forEach(System.out::println);

        StreamSources.intNumbersStream().flatMap(originalElem ->
                        StreamSources.userStream().filter(x -> x.getId() == originalElem))
                .map(user -> user.getFirstName())
                .forEach(System.out::println);
        ;

    }

}
