package com.dekapx.java.stream;

import com.dekapx.java.model.AppEvent;
import com.dekapx.java.model.EventSubscriber;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NestedCollectionStreams {
    public static void main(String[] args) {
        final List<String> apps = List.of("Word", "WordPed", "Excel");
        System.out.println(filterApps(apps, "FileUpdated"));
    }

    // Option 1
    private static List<String> filterApps(List<String> apps, String eventName) {
        List<EventSubscriber> eventSubscribers = getEventSubscribers();
        return apps.stream().
                filter(app -> eventSubscribers.stream()
                        .filter(e -> e.getAppId().equals(app))
                        .flatMap(e -> e.getAppEvents().stream())
                        .filter(appEvent -> appEvent.getEventName().equals(eventName))
                        .findAny().isPresent())
                .collect(Collectors.toList());
    }

    // Option 2
    private static boolean isSubscribedAppEvent(String app, String eventName) {
        List<EventSubscriber> eventSubscribers = getEventSubscribers();

        Optional<AppEvent> optional = eventSubscribers.stream()
                .filter(e -> e.getAppId().equals(app))
                .flatMap(e -> e.getAppEvents().stream())
                .filter(appEvent -> appEvent.getEventName().equals(eventName))
                .findAny();
        return optional.isPresent();
    }


    private static List<EventSubscriber> getEventSubscribers() {
        return List.of(
                EventSubscriber.builder().appId("Word").appEvents(
                        List.of(AppEvent.builder().eventName("FileCreated").build(),
                                AppEvent.builder().eventName("FileUpdated").build(),
                                AppEvent.builder().eventName("FileDeleted").build())
                ).build(),
                EventSubscriber.builder().appId("WordPed").appEvents(
                        List.of(AppEvent.builder().eventName("FileCreated").build(),
                                AppEvent.builder().eventName("FileUpdated").build(),
                                AppEvent.builder().eventName("FileDeleted").build())
                ).build(),
                EventSubscriber.builder().appId("Excel").appEvents(
                        List.of(AppEvent.builder().eventName("SheetCreated").build(),
                                AppEvent.builder().eventName("SheetUpdated").build(),
                                AppEvent.builder().eventName("SheetDeleted").build())
                ).build()
        );
    }
}
