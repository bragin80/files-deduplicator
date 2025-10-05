package by.bragin.accessor.api;

import by.bragin.accessor.api.contract.AccessorContract;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "by.bragin.accessor.api.AccessorClient", url = "${feign.fs-accessor-api}")
public interface AccessorClient extends AccessorContract {
}
