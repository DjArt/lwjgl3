/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing whether the implementation supports maintenance4 functionality.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance4FeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMaintenance4FeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance4#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance4FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #maintenance4};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance4FeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAINTENANCE4;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAINTENANCE4 = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance4FeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>The application <b>may</b> destroy a {@code VkPipelineLayout} object immediately after using it to create another object.</li>
     * <li>{@code LocalSizeId} <b>can</b> be used as an alternative to {@code LocalSize} to specify the local workgroup size with specialization constants.</li>
     * <li>Images created with identical creation parameters will always have the same alignment requirements.</li>
     * <li>The size memory requirement of a buffer or image is never greater than that of another buffer or image created with a greater or equal size.</li>
     * <li>Push constants do not have to be initialized before they are dynamically accessed.</li>
     * <li>The interface matching rules allow a larger output vector to match with a smaller input vector, with additional values being discarded.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean maintenance4() { return nmaintenance4(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance4FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance4#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance4FeaturesKHR sType$Default() { return sType(KHRMaintenance4.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMaintenance4FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maintenance4} field. */
    public VkPhysicalDeviceMaintenance4FeaturesKHR maintenance4(@NativeType("VkBool32") boolean value) { nmaintenance4(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance4FeaturesKHR set(
        int sType,
        long pNext,
        boolean maintenance4
    ) {
        sType(sType);
        pNext(pNext);
        maintenance4(maintenance4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance4FeaturesKHR set(VkPhysicalDeviceMaintenance4FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance4FeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMaintenance4FeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance4FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance4FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #maintenance4}. */
    public static int nmaintenance4(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance4FeaturesKHR.MAINTENANCE4); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMaintenance4FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance4FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #maintenance4(boolean) maintenance4}. */
    public static void nmaintenance4(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMaintenance4FeaturesKHR.MAINTENANCE4, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance4FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance4FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance4FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance4FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance4FeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceMaintenance4FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance4FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance4FeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance4FeaturesKHR#maintenance4} field. */
        @NativeType("VkBool32")
        public boolean maintenance4() { return VkPhysicalDeviceMaintenance4FeaturesKHR.nmaintenance4(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance4FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance4#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer sType$Default() { return sType(KHRMaintenance4.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance4FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance4FeaturesKHR#maintenance4} field. */
        public VkPhysicalDeviceMaintenance4FeaturesKHR.Buffer maintenance4(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMaintenance4FeaturesKHR.nmaintenance4(address(), value ? 1 : 0); return this; }

    }

}