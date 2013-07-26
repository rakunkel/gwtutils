package gov.ca.ceres.gwtutils.client;

import com.google.gwt.event.shared.GwtEvent;

public class MapCloseEvent extends GwtEvent<MapCloseEventHandler> {

public static Type<MapCloseEventHandler> TYPE = new Type<MapCloseEventHandler>();

  @Override
public Type<MapCloseEventHandler> getAssociatedType() {
    return TYPE;
}

@Override
protected void dispatch(MapCloseEventHandler handler) {
    handler.onMapClose(this);
}
}